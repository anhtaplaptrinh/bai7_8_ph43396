package com.example.bai7_8_ph43396.model_bai7

open class Nguoi(var magv: String, var hoten: String, var tuoi: Int?, var quequan: String){
    open fun getThongTin () : String {
        return "$magv - $hoten - $tuoi - $quequan"
    }
}