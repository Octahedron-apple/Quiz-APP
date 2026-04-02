package com.example.quizapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.btn_start_quiz).setOnClickListener(v -> startActivity(new Intent(this, QuizActivity.class)));
        findViewById(R.id.btn_make_quiz).setOnClickListener(v -> startActivity(new Intent(this, MakeQuizActivity.class)));
        findViewById(R.id.btn_view_scores).setOnClickListener(v -> startActivity(new Intent(this, ViewScoresActivity.class)));
        findViewById(R.id.btn_about).setOnClickListener(v -> startActivity(new Intent(this, AboutActivity.class)));
        findViewById(R.id.btn_exit).setOnClickListener(v -> finishAffinity());
    }
}
