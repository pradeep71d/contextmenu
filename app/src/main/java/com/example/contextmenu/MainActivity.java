package com.example.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView li;
String st[]={"Anoop","pradeep","sapna","amit","ajay","akash","aarav","Anoop","pradeep","sapna","amit","ajay","akash","aarav"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        li=findViewById(R.id.l1);
        ArrayAdapter ar=new ArrayAdapter(this,android.R.layout.simple_list_item_1);
        li.setAdapter(ar);
        registerForContextMenu(li);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("choose option");
        menu.add(0,v.getId(),0,"edit");
        menu.add(0,v.getId(),0,"delete");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
         super.onContextItemSelected(item);
        if (item.getTitle()=="edit")
        {
            Toast.makeText(this, "item is edited", Toast.LENGTH_SHORT).show();
        }
else if (item.getTitle()=="delete")
        {
            Toast.makeText(this, "item is deleted", Toast.LENGTH_SHORT).show();
        }
else
        {
return  false;
        }
        return true;
    }
}
