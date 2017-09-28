package com.github.rcfgnu.sillyconstraintslayoutexamples;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;

public class ChainActivity extends AppCompatActivity {
  private ConstraintSet constraintSet1 = new ConstraintSet();
  private ConstraintSet constraintSet2 = new ConstraintSet();
  private ConstraintLayout constraintLayout;
  private boolean animated = true;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_chain);
    constraintLayout = findViewById(R.id.activity_chain);

    constraintSet1.clone(constraintLayout);
    constraintSet2.clone(this, R.layout.activity_chain_scene2);

    findViewById(R.id.animateButton).setOnClickListener(v -> {
      TransitionManager.beginDelayedTransition(constraintLayout);
      if (animated = !animated) {
        constraintSet1.applyTo(constraintLayout);
      } else {
        constraintSet2.applyTo(constraintLayout);
      }
    });
  }
}
