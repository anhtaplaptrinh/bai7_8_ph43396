package com.example.bai7_8_ph43396
import com.example.bai7_8_ph43396.model_bai7.CBGV


fun main() {

    var listCBGV = mutableListOf<CBGV>()

    val cbgv = CBGV("GV1", "Nguyen Van Anh", 20, "Ha Noi", 14000f, 20200f, 300f)
    val cbgv1 = CBGV("GV1", "Tran Tuan Anh", 22, "Nam Dinh", 4000f, 20200f, 400f)

    listCBGV.add(cbgv)
    listCBGV.add(cbgv1)

    do {
        println("------Chuc nang-------")
        println("1. Xem danh sach sinh vien")
        println("2. Them giao vien")
        println("3. Xoa sinh vien")
        println("4. Tinh luong thuc linh giao vien")

        print("Moi chon chuc nang: ")
        var s = readLine()!!.toInt()

        when (s) {
            1 -> {
                for (gv in listCBGV){
                    println(gv.getThongTin())
                }
            }

            2 -> {
                addGV(listCBGV)
                for (gv in listCBGV){
                    println(gv.getThongTin())
                }
            }

            3 -> {
                deleteGV(listCBGV)
                for (gv in listCBGV){
                    println(gv.getThongTin())
                }
            }

            4 -> {
                luonglinhthuc(listCBGV)
            }

            else -> println("Chuc nang khong ton tai")
        }

        print("Ban co muon tiep tuc khong? (y/n): ")
        if (readLine().equals("n"))
            break
    } while (true)
}

fun addGV(listCBGV: MutableList<CBGV>) {
    print("Nhap ma giao vien: ")
    var magv = readLine()
    print("Nhap ho ten giao vien: ")
    var hoten = readLine()
    print("Nhap tuoi giao vien: ")
    var tuoi = readLine()!!.toInt()
    print("Nhap que quan: ")
    var quequan = readLine()
    print("Nhap luong giao vien: ")
    var luongcung = readLine()!!.toFloat()
    print("Nhap tien thuong: ")
    var tienthuong = readLine()!!.toFloat()
    print("Nhap tien phat: ")
    var tienphat = readLine()!!.toFloat()

    val cbgv = CBGV(magv!!, hoten!!, tuoi, quequan!!, luongcung, tienthuong, tienphat)

    listCBGV.add(cbgv)
}

fun deleteGV(listCBGV: MutableList<CBGV>) {
    print("Nhap ma giao vien can xoa: ")
    var magv = readLine()

    var check = false

    for (gv in listCBGV) {
        if (gv.magv.equals(magv)) {
            listCBGV.remove(gv)
            check = true
            break
        }
    }

    if (check == false)
        println("Giao vien khong ton tai")
}

fun luonglinhthuc(listCBGV: MutableList<CBGV>) {
    for (gv in listCBGV) {
        println("Luong cua giao vien ${gv.hoten} la: ${gv.luongthuclinh}")
    }
}


