package com.example.hp.techie;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hp.techie.adapters.ArticleAdapter;
import com.example.hp.techie.apis.ApiService;
import com.example.hp.techie.models.NewsObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView rvArticle;
    static ArticleAdapter articleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rvArticle = (RecyclerView) findViewById(R.id.rvNews);
        articleAdapter = new ArticleAdapter(this);
        rvArticle.setLayoutManager(new LinearLayoutManager(this));
        rvArticle.setAdapter(articleAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setTitle("IGN");
        findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFED454B"));

        ApiService.getApi().getArticle("ign","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
            @Override
            public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                articleAdapter.updateArticle(response.body().getArticles());
            }

            @Override
            public void onFailure(Call<NewsObject> call, Throwable t) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_ign) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ign) {

            setTitle("IGN");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFED454B"));

            ApiService.getApi().getArticle("ign","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        } else if (id == R.id.nav_techcrunch) {

            setTitle("Tech Crunch");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFC9ED45"));

            ApiService.getApi().getArticle("techcrunch","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        } else if (id == R.id.nav_techradar) {

            setTitle("Tech Radar");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FF4583ED"));

            ApiService.getApi().getArticle("techradar","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        } else if (id == R.id.nav_nextweb) {

            setTitle("The Next Web");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFB845ED"));

            ApiService.getApi().getArticle("the-next-web","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        } else if (id == R.id.nav_polygon) {

            setTitle("Polygon");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFED45BD"));

            ApiService.getApi().getArticle("polygon","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        } else if (id == R.id.nav_recode) {

            setTitle("Recode");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFED8E45"));

            ApiService.getApi().getArticle("recode","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        }else if (id == R.id.nav_scientist) {

            setTitle("New Scientist");
            findViewById(R.id.content).setBackgroundColor(Color.parseColor("#FFDEE943"));

            ApiService.getApi().getArticle("new-scientist","7b9c3b48551343ac9a3bf71bfa9b6bad").enqueue(new Callback<NewsObject>() {
                @Override
                public void onResponse(Call<NewsObject> call, Response<NewsObject> response) {
                    articleAdapter.updateArticle(response.body().getArticles());
                }

                @Override
                public void onFailure(Call<NewsObject> call, Throwable t) {

                }
            });

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}