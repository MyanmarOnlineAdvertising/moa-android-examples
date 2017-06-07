package com.zeta.moa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.zeta.moaadssdk.Adapter.MoaAdsAdapter;
import com.zeta.moaadssdk.Base.ClientBaseData;
import com.zeta.moaadssdk.MoaAds;
import com.zeta.moaadssdk.Views.MoaAdsView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final MoaAdsView moaAdsView = (MoaAdsView) findViewById(R.id.moa_ads_container);
    moaAdsView.addAdsListener(new MoaAdsView.MoaAdListener() {
      @Override public void onAdsLoaded(int code) {

      }

      @Override public void onAdsFailed(int code) {

      }
    });

    RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.mRecyclerView);

    MoaAds moaAds = new MoaAds(this);
    moaAds.initFullScreenAds(3, "fid_b0392233343434343483434343434");

    List<People> mList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      People mPeople = new People();
      mPeople.name = "Mock User one : " + i;
      mPeople.age = String.valueOf(i);
      mList.add(mPeople);
    }

    PeopleAdapter mPeopleAdapter = new PeopleAdapter();
    mPeopleAdapter.setItems(mList);
    MoaAdsAdapter moaAdsAdapter =
        new MoaAdsAdapter(mPeopleAdapter, this, "aid_ee3cd4444343343434343");

    mRecyclerView.setAdapter(moaAdsAdapter);
    mRecyclerView.setHasFixedSize(true);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
  }
}


