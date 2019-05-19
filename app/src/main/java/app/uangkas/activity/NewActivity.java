package app.uangkas.activity;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.uangkas.R;
import app.uangkas.adapter.ViewPagerAdapter;
import app.uangkas.fragment.Keluar;
import app.uangkas.fragment.Masuk;

public class NewActivity extends AppCompatActivity {


    private ViewPager view_pager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        view_pager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        addTabs(view_pager);
        tabLayout.setupWithViewPager(view_pager);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tambah");
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Masuk(), "Pemasukan");
        adapter.addFrag(new Keluar(), "Pengeluaran");
        viewPager.setAdapter(adapter);
    }
}
