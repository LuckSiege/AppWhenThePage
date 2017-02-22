package com.luck.app.page;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;

import com.luck.app.page.when_page.PageFrameLayout;

public class MainActivity extends FragmentActivity {
    private PageFrameLayout contentFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentFrameLayout = (PageFrameLayout) findViewById(R.id.contentFrameLayout);
        // 设置资源文件和选中圆点
        contentFrameLayout.setUpViews(new int[]{
                R.layout.page_tab1,
                R.layout.page_tab2,
                R.layout.page_tab3,
                R.layout.page_tab4
        }, R.mipmap.banner_on, R.mipmap.banner_off);


    }
}
