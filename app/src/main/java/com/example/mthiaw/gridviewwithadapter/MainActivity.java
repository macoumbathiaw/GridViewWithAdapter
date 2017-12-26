package com.example.mthiaw.gridviewwithadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find the GridView ID and place it into the gridview instance
        GridView gridview = (GridView) findViewById(R.id.gridview);

        //Use the gridview instance and set the ImageAdapter
        //We must create a ImageAdapter class to be able to use with the "new" key as seen below
        gridview.setAdapter(new ImageAdapter(this));

        //once the image is set to display using the adapter, we can have a toast displayed when the image is clicked on.
        //we use the GridView method setOnItemClickListener to listen for an event
        //then we show a Toast.

        //The overide methode is generated at the "new AdapterView.OnitemClickListener"
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //The Toast message
                Toast.makeText(MainActivity.this, "" + i,
                        Toast.LENGTH_SHORT).show();

            }
        });


    }
}
