package com.github.rcfgnu.sillyconstraintslayoutexamples;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;

public class PlaceholderActivity extends AppCompatActivity {

  private Placeholder placeholder;
  private ConstraintLayout constraintLayout;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_placeholder);

    constraintLayout = findViewById(R.id.activity_placeholder);
    placeholder = findViewById(R.id.placeholder);

    findViewById(R.id.imageView1).setOnClickListener(this::animate);

    findViewById(R.id.imageView2).setOnClickListener(this::animate);

    findViewById(R.id.imageView3).setOnClickListener(this::animate);

    findViewById(R.id.imageView4).setOnClickListener(this::animate);

    findViewById(R.id.imageView5).setOnClickListener(this::animate);

    placeholder.setOnClickListener(this::animate);

  }

  private void animate(View v) {
    TransitionManager.beginDelayedTransition(constraintLayout);
    placeholder.setContentId(v.getId());
  }
}
