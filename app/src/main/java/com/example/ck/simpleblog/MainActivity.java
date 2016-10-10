package com.example.ck.simpleblog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
//https://www.youtube.com/watch?v=Yx8lRrclCYo&index=20&list=PLGCjwl1RrtcTXrWuRTa59RyRmQ4OedWrt#t=14.086621
//10:35

public class MainActivity extends AppCompatActivity {

    private RecyclerView mBlogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBlogList = (RecyclerView) findViewById(R.id.blog_list);
        mBlogList.setHasFixedSize(true);
        mBlogList.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public BlogViewHolder(View itemView) {
            super(itemView);

            itemView = mView;
        }

        public void setTitle(String title) {

            TextView post_title = (TextView)mView.findViewById(R.id.post_title);
            post_title.setText(title);

        }
        public void setDesc(String desc) {

            TextView post_dsec = (TextView)mView.findViewById(R.id.post_desc);
            post_dsec.setText(desc);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.action_add){
            startActivity(new Intent(MainActivity.this, PostActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
