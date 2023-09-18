package services;

import model.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassManage {
    //Tạo nơi lưu trữ lớp trước
    //CRUD = CREATE + READ + UPDATE + DELETE
    //Lưu trữ từ dữ dữ liệu người dùng nhập vào

    //Tạo một arrayList để lưu trữ trước
    private ArrayList<Classes> classes; //Tạo mảng arrayList với kiểu dử liệu là lớp "Classes" với tên biến là classes
    private Scanner sc; // tạo biến scanner để người dùng nhập giá trị

    public ClassManage() {
        classes = new ArrayList<Classes>();//Tạo một đối tượng mới để lưu trữ các đối tượng thuộc kiểu 'Classes'
        sc = new Scanner(System.in);
    }

    //Hiển thị các lớp học: Read
    public void showClasses(){
        //dùng for each để truy cập và đọc tuần tự các dữ liệu trong mảng
        // for(KDL bien : mang)
        for(Classes classes : classes){
            System.out.println(classes);
        }
    }

}
