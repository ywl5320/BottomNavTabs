# BottomNavTabs<br/>
## Android底部功能导航和圆点提示封装<br/>
## 效果图<br/>
## 真机<br/>
![image](https://github.com/wanliyang1990/BottomNavTabs/blob/master/imgs/tabview.png)<br/>
## gif动画<br/>
![image](https://github.com/wanliyang1990/BottomNavTabs/blob/master/imgs/tabview.gif)<br/>


## 调用方法：<br/>

        private String[] titles = {"附近", "动态", "消息", "发现", "我的"};
        private int[] imgs = {R.drawable.nav_nearby_selector, R.drawable.nav_circle_selector, R.drawable.nav_message_selector, R.drawable.nav_find_selector, R.drawable.nav_me_selector};
        
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
        

    
# create by ywl5320