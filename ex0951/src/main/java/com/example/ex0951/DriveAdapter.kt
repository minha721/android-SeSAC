package com.example.ex0951

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat

// ArrayAdapter를 상속 받을 것이기 때문에 ArrayAdapter와 매개변수를 동일하게 설정
class DriveAdapter(cxt: Context, val resId: Int, val datas: MutableList<DriveVO>) : ArrayAdapter<DriveVO>(cxt, resId){
    override fun getCount(): Int {
        return datas.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        if(convertView == null) {
            // 뷰객체가 준비가 안되어 있을 때
            // 개발자가 임의의 순간 xml 파일로 정의되어 있는 레이아웃 리소스를 초기화 시켜서 뷰 객체를 생성
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(resId, null)

            val holder = DriveHolder(convertView)
            convertView!!.tag = holder
        }

        val holder = convertView.getTag() as DriveHolder
        val typeImageView = holder.typeImageView
        val titleView = holder.titleView
        val dateView = holder.dateView
        val menuImageView = holder.menuImageView

        val (title, date, type) = datas[position]
        titleView.text = title
        dateView.text = date
        if(type == "doc") {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.resources, R.drawable.ic_type_doc, null))
        }else if(type == "file") {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.resources, R.drawable.ic_type_file, null))
        }else if(type == "img") {
            typeImageView.setImageDrawable(ResourcesCompat.getDrawable(context.resources, R.drawable.ic_type_image, null))
        }
        menuImageView.setOnClickListener {
            Toast.makeText(context, "$title menu click", Toast.LENGTH_SHORT).show()
        }
        return convertView
    }
}