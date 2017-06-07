package com.zeta.moa;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by indexer on 22/5/17.
 */

public class PeopleAdapter extends BaseAdapter<PeopleItemView, People> {
  @Override public PeopleItemView onCreateViewHolder(ViewGroup parent, int
      viewType) {
    View view =
        LayoutInflater.from(parent.getContext()).inflate(R.layout.people_item, parent, false);
    return new PeopleItemView(view, null);
  }

  @Override public void onBindViewHolder(PeopleItemView holder, int position) {
    holder.onBind(mItems.get(position), position);
  }
}
