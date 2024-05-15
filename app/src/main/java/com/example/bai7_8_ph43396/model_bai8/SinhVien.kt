package com.example.bai7_8_ph43396.model_bai8


open class SinhVien(var hoten: String, var tuoi: Int, var lop: String) {
    open fun getThongTin(): String {
        return "ho ten: $hoten, tuoi: $tuoi, lop: $lop"
    }
}