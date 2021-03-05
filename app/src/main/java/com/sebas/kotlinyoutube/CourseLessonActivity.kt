package com.sebas.kotlinyoutube


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sebas.kotlinyoutube.R
import kotlinx.android.synthetic.main.activity_course_lesson.*

class CourseLessonActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_course_lesson)

        val courseLink = intent.getStringExtra(CourseDetailActivity.CourseLessonViewHolder.COURSE_LESSON_LINK_KEY)

        webview_course_lesson.settings.javaScriptEnabled = true
        webview_course_lesson.settings.loadWithOverviewMode = true
        webview_course_lesson.settings.useWideViewPort = true

        if (courseLink != null) {
            webview_course_lesson.loadUrl(courseLink)
        }

    }
}