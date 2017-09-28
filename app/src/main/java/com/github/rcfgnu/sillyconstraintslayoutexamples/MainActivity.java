// Copyright 2016 Google Inc.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// 
//      http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.github.rcfgnu.sillyconstraintslayoutexamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

  private static final String[] EXAMPLES = {"Basic", "Chain", "Group", "Placeholder"};

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ListView list = new ListView(this);
    setContentView(list);

    list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, EXAMPLES));
    list.setOnItemClickListener(this);
  }

  @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    switch (position) {
      case 0: //Basic Example
        startActivity(new Intent(this, BasicActivity.class));
        break;
      case 1: //Chain Example
        startActivity(new Intent(this, ChainActivity.class));
        break;
      case 2: //Group Example
        startActivity(new Intent(this, GroupActivity.class));
        break;
      case 3: //Placeholder Example
        startActivity(new Intent(this, PlaceholderActivity.class));
        break;
      default:
        break;
    }
  }
}
