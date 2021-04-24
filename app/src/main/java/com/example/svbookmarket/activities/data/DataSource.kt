package com.example.svbookmarket.activities.data

import com.example.svbookmarket.R
import com.example.svbookmarket.activities.model.AddressModel
import com.example.svbookmarket.activities.model.CartModel
import com.example.svbookmarket.activities.model.CheckoutCard

class DataSource {
    fun loadCheckoutCard(): MutableList<CheckoutCard> {
        return mutableListOf(
            CheckoutCard("dsadsa","casc","adr","100","123"),
            CheckoutCard("dsadsa","casc","adr","100","123"),
            CheckoutCard("dsadsa","casc","adr","100","123"),
            CheckoutCard("dsadsa","casc","adr","100","123"),
            CheckoutCard("dsadsa","casc","adr","100","123"),
            CheckoutCard("dsadsa","casc","adr","100","123"),

        )
    }
    fun loadCart():MutableList<CartModel>{
        return mutableListOf(
            CartModel("cc","cc","cc","cc","1000" ),
            CartModel("cc","cc","cc","cc","200" ),
            CartModel("cc","cc1","cc","cc","113" ),
            CartModel("cc","cc","cc","cc","1997" ),
            CartModel("cc","cc","cc","cc","2001" ),
            CartModel("cc","cc1","cc","cc","99" ),

        )
    }
    fun loadAddressCard():MutableList<AddressModel>{
        return mutableListOf(
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
            AddressModel("Khuong Duy","0869256174","Ktx khu A, DHQG","Phuong Linh Trung", "Quan Thu Duc","Tp.Ho Chi Minh"),
        )
    }
}