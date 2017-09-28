package com.github.rcfgnu.sillyconstraintslayoutexamples;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;

public class GroupActivity extends AppCompatActivity {

  private ConstraintLayout constraintLayout;
  private Group group;
  private boolean animated = true;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_group);

    constraintLayout = findViewById(R.id.activity_group);
    group = findViewById(R.id.group);

    findViewById(R.id.animateButton).setOnClickListener(this::animate);
  }

  private void animate(View v) {
    TransitionManager.beginDelayedTransition(constraintLayout);
    if(animated = !animated) {
      group.setVisibility(View.VISIBLE);
    } else {
      group.setVisibility(View.GONE);
    }
  }

}
