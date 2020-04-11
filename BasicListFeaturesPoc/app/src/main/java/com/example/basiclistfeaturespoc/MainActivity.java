package com.example.basiclistfeaturespoc;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayAdapter<CharSequence> adapterAnimals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // display the GUI defined in the activity_main.xml file
        setContentView(R.layout.activity_main);

        // retrieve a reference to the View defined in the activity_main.xml
        ListView listViewAnimals = (ListView) findViewById(R.id.listView);

        // build an adapter to feed the list with the content of an array of strings
        // (defined in the res/values/strings.xml file), and where each string will be
        // rendered as a TextView (as defined by the built-in simple_list_item_1 layout).
        adapterAnimals = ArrayAdapter.createFromResource(this, R.array.animalsArray, android.R.layout.simple_list_item_1);

        // attache the adapter to the Listview
        listViewAnimals.setAdapter(adapterAnimals);

        // attach a listener to the ListView to react to item click events
        listViewAnimals.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // retrieve part of the message to display in the appropriate language from the
        // res/values/string.xml file
        String messagePart1 = getString(R.string.toastMessage);
        // use index of the clicked item to retrieve text from the animal string array
        String messagePart2 = (String) adapterAnimals.getItem(position);
        // display a pop-up message for a short duration
        String message = messagePart1 + " " + messagePart2;
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}

