package com.example.namadokter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String names[]={
            "Agustrian Maulana",
            "Angela Tyas Manna",
            "Annisa Pratiwi",
            "Ari Nurhayati",
            "Asri Mayanti Panggabean",
            "Dicky Putra Nugraha",
            "Dicky Putra Pratama",
            "Fully Oktriviani",
            "Gena Pradita",
            "Iman Nurachman",
            "Luthfi Naufal Gibrani",
            "Mega Widyawati",
            "Meiwa Rian ",
            "Merdhika",
            "Millatu Fadhillah",
            "Nabila Shaffa Bestari",
            "Nurmiadha Nisa Karimah",
            "Ocha Armalia Fadelo",
            "Rahat Hidayat",
            "Rayhan Nirmala",
            "Reffy Mahesya",
            "Sarah Najmanita Silvelina Isma",
            "Shavira O",
            "Tasha Dinya",
            "Tiur Nova",
            "Ulima Larisa",
            "Widya Isti",
            "Zahra Jihad",
            "Maudy Rachma"
    };

    private String desc[]={
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Rabu(08:00-15.00)",
            "Praktek : Senin-Kamis(08:00-15.00)",
            "Praktek : Senin-Kamis(08:00-15.00)",
            "Praktek : Sabtu-Minggu(08:00-15.00)",
            "Praktek : Senin-Sabtu(08:00-15.00)",
            "Praktek : Senin-Rabu(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-amis(08:00-15.00)",
            "Praktek : Sabtu-Minggu(08:00-15.00)",
            "Praktek : Senin-Rabu(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Kamis(08:00-15.00)",
            "Praktek : Senin-Kamis(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Sabtu-Minggu(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Rabu(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Selasa(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)",
            "Praktek : Senin-Sabtu(08:00-15.00)",
            "Praktek : Senin-Jum'at(08:00-15.00)"
    };

    private String no_tlp[] = {
            "No_Tlp : 03948524",
            "No_Tlp : 32245524",
            "No_Tlp : 32245536",
            "No_Tlp : 32244567",
            "No_Tlp : 03948524",
            "No_Tlp : 76767775",
            "No_Tlp : 32245776",
            "No_Tlp : 32245567",
            "No_Tlp : 03948524",
            "No_Tlp : 32245524",
            "No_Tlp : 32245456",
            "No_Tlp : 32245456",
            "No_Tlp : 03948524",
            "No_Tlp : 22455234",
            "No_Tlp : 34657576",
            "No_Tlp : 45467677",
            "No_Tlp : 03948547",
            "No_Tlp : 32245526",
            "No_Tlp : 32245525",
            "No_Tlp : 32245589",
            "No_Tlp : 03948578",
            "No_Tlp : 32245567",
            "No_Tlp : 32245546",
            "No_Tlp : 32245524",
            "No_Tlp : 03948526",
            "No_Tlp : 32245523",
            "No_Tlp : 32245525",
            "No_Tlp : 32245523",
            "No_Tlp : 32245522"
    };

    private Integer imageid[]={
            R.drawable.laki,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.laki,
            R.drawable.laki,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.laki,
            R.drawable.laki,
            R.drawable.perempuan,
            R.drawable.laki,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.laki,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.perempuan,
            R.drawable.laki
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListNama mahasiswalist = new ListNama(this, names, desc, no_tlp, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(mahasiswalist);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "You Clicked" + names[i], Toast.LENGTH_SHORT).show();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
