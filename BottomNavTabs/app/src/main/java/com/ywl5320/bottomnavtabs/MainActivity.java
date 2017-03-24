package com.ywl5320.bottomnavtabs;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayoutView tabLayoutView;

    private ViewPagerAdapter viewPagerAdapter;

    private List<Fragment> fragmentPages;
    private FragmentPage fragmentPage1;
    private FragmentPage fragmentPage2;
    private FragmentPage fragmentPage3;
    private FragmentPage fragmentPage4;
    private FragmentPage fragmentPage5;

    private String[] titles = {"附近", "动态", "消息", "发现", "我的"};
    private int[] imgs = {R.drawable.nav_nearby_selector, R.drawable.nav_circle_selector, R.drawable.nav_message_selector, R.drawable.nav_find_selector, R.drawable.nav_me_selector};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayoutView = (TabLayoutView) findViewById(R.id.tabview);
        initFragments();

        tabLayoutView.setDataSource(titles, imgs, 0);
        tabLayoutView.setImageStyle(25, 25);
        tabLayoutView.setTextStyle(12, R.color.color_999999,R.color.color_ff78a3);
        tabLayoutView.initDatas();
        setDots();
        tabLayoutView.setOnItemOnclickListener(new TabLayoutView.OnItemOnclickListener() {
            @Override
            public void onItemClick(int index) {
                viewPager.setCurrentItem(index, true);
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                viewPager.setCurrentItem(position, false);
                tabLayoutView.setSelectStyle(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    private void initFragments()
    {
        fragmentPages = new ArrayList<>();
        fragmentPage1 = new FragmentPage();
        fragmentPage2 = new FragmentPage();
        fragmentPage3 = new FragmentPage();
        fragmentPage4 = new FragmentPage();
        fragmentPage5 = new FragmentPage();

        fragmentPages.add(fragmentPage1);
        fragmentPages.add(fragmentPage2);
        fragmentPages.add(fragmentPage3);
        fragmentPages.add(fragmentPage4);
        fragmentPages.add(fragmentPage5);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentPages);
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void setDots()
    {
        tabLayoutView.setDotsCount(0, 1);
        tabLayoutView.setDotsCount(1, 0);
        tabLayoutView.setDotsCount(2, 3);
        tabLayoutView.setDotsCount(3, 0);
        tabLayoutView.setDotsCount(4, 5);
    }
}
