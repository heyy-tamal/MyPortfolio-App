package com.example.myportfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
        val buttonResume = findViewById<Button>(R.id.btnResume)
        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        val buttonProject = findViewById<Button>(R.id.btnProject)
        val buttonEducation = findViewById<Button>(R.id.btnEducation)


        buttonResume.setOnClickListener {
            intent = Intent(this, ResumeActivity::class.java)
            startActivity(intent)
        }

        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonProject.setOnClickListener {
            intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }

        buttonEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }


    }
}