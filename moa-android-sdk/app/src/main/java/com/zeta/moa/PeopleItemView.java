package com.zeta.moa;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by indexer on 22/5/17.
 */

public class PeopleItemView extends BaseViewHolder {
  TextView people_age;
  TextView people_name;

  public PeopleItemView(View itemView, OnItemClickListener listener) {
    super(itemView, listener);
    people_age = (TextView) itemView.findViewById(R.id.people_name);
    people_name = (TextView) itemView.findViewById(R.id.people_age);
  }

  @Override public void onClick(View v) {
    Toast.makeText(v.getContext(), "Hello", Toast.LENGTH_LONG).show();
  }

  public void onBind(People people, int position) {
    people_name.setText(people.getName());
    people_age.setText(people.getAge());
  }
}
