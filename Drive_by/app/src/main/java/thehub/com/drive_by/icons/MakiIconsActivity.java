package thehub.com.drive_by.icons;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import thehub.com.drive_by.R;

public class MakiIconsActivity extends AppCompatActivity {

  private RecyclerView recyclerView;
  private RecyclerView.Adapter adapter;
  private RecyclerView.LayoutManager layoutManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_maki_icons);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    // The recycler view set up
    recyclerView = (RecyclerView) findViewById(R.id.maki_icon_recycler_view);
    recyclerView.setHasFixedSize(true);

    // Use a grid layout manager
    int cols = (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE ? 4 : 3);
    layoutManager = new GridLayoutManager(this, cols);
    recyclerView.setLayoutManager(layoutManager);

    // Specify an adapter
    adapter = new IconAdapter(MakiList.ICONS_15);
    recyclerView.setAdapter(adapter);
  }

}
