package com.example.svbookmarket.activities.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.svbookmarket.activities.common.Constants.VMTAG
import com.example.svbookmarket.activities.data.BookRepository
import com.example.svbookmarket.activities.model.Book
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestoreException
import com.google.firebase.firestore.QuerySnapshot
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeatureViewModel  @Inject constructor(
     private val bookRepository: BookRepository
) : ViewModel() {

    private var _books = MutableLiveData<MutableList<Book>>()
    val books get() = _books

    //    fun getBookFrom() = liveData(Dispatchers.IO) {
//        bookRepository.getBookFrom().collect { respone ->
//            Log.i(Constants.VMTAG, "$respone")
//            emit(respone)
//        }
//    }
    fun getBookFrom(): MutableLiveData<MutableList<Book>> {
        bookRepository.getBooksFromCloudFirestore1().addSnapshotListener(object :
            EventListener<QuerySnapshot> {
            override fun onEvent(value: QuerySnapshot?, error: FirebaseFirestoreException?) {
                if (error != null) {
                    Log.w(VMTAG, "Listen failed.", error)
                    return
                }

                val bookList: MutableList<Book> = ArrayList()
                for (doc in value!!) {
                    var bookItem = doc.toObject(Book::class.java)
                    bookList.add(bookItem)

                }
                books.value = bookList
                Log.d(VMTAG, "book list fetched: $books")
            }

        })

        Log.d(VMTAG, "feature called")

        return books
    }
    init {
        getBookFrom()
    }
}