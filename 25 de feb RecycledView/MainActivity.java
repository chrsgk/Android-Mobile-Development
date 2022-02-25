package es.ua.eps.recycledview25022022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    //Here we are going to create three activiteis from three classes:

    RecyclerView lista;
    RecyclerView.LayoutManager layout;
    RecyclerView.Adapter adaptador;

    String[] Data = new String[]{"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (RecyclerView) findViewById(R.id.RecyclerView);

        //Im connecting the RecyclerView to a layout manager. the idea here is to structure our list with a vetical orientation

        lista.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        adaptador = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null;
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        };

    }
}