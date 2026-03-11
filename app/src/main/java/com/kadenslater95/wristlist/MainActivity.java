package com.kadenslater95.wristlist;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ListItem> listItems;
    private ListItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textInput = findViewById(R.id.inputText);

        Button addButton = findViewById(R.id.addButton);

        RecyclerView recyclerView = findViewById(R.id.itemsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<ListItem>();
        adapter = new ListItemAdapter(listItems);

        recyclerView.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String text = textInput.getText().toString().trim();

            if (!text.isEmpty()) {
                listItems.add(new ListItem(text));
                adapter.notifyItemInserted(listItems.size() - 1);
                textInput.setText("");
            }
        });
    }
}