package com.example.ex1721

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context): SQLiteOpenHelper(context, "testdb", null, 1) {
    //OpenHelper가 처음 call될 대 onCreate 함수 자동 호출해서 테이블 생성
    override fun onCreate(p0: SQLiteDatabase?) {
        val studentSql = """
            create table tb_member (
            _id integer primary key autoincrement,
            name not null,
            email,
            phone)
        """.trimIndent()
        p0?.execSQL(studentSql)
        p0?.execSQL("insert into tb_member (name, email, phone) values ('minha', '2minha721@gmail.com', '010-1234-5678')")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        //상위 클래스의 버전 정보가 바뀌었을 대 실행되는 함수
        p0?.execSQL("drop table tb_student")
        onCreate(p0)
    }
}