package tdtu.l.music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    Toolbar bar;
    DrawerLayout layout;
    NavigationView navigationView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        actionbar();
    }

    private void actionbar() {
        setSupportActionBar(bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        bar.setNavigationIcon(R.drawable.menu);
        bar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void anhxa() {
        bar            = findViewById(R.id.toolbar);
        layout         = findViewById(R.id.drawer_menu);
        navigationView = findViewById(R.id.navView);
        listView       = findViewById(R.id.menu);
    }
}