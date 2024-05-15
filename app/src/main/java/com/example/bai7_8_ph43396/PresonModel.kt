package com.example.bai7_8_ph43396

open class PresonModel{
    var hoten:String
    var tuoi : Int?
    var quequan:String?
    constructor(hoten: String,tuoi:Int?,quequan:String?){
        this.hoten=hoten
        this.tuoi=tuoi
        this.quequan=quequan
    }
    open fun  getThongtin():String{
return "$hoten - $tuoi - $quequan"
    }
}