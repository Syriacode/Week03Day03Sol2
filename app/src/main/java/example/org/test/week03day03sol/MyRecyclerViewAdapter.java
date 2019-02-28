package example.org.test.week03day03sol;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    ArrayList<Animal> animalArrayList;

    public MyRecyclerViewAdapter(ArrayList<Animal> animalArrayList) {
        this.animalArrayList = animalArrayList;
    }


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {

        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.animal_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        Animal currentAnimalBeingPopulated = animalArrayList.get(position);
        viewHolder.tvAnimalType.setText(currentAnimalBeingPopulated.getAnimalType());
        viewHolder.tvAnimalName.setText(currentAnimalBeingPopulated.getAnimalName());
        viewHolder.tvAnimalSound.setText(currentAnimalBeingPopulated.getAnimalSound());

        Log.d("TAG", "onBindViewHolder: item being rendered = " + position);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(), beveragesArrayList.get(position).getName() + "clicked", Toast.LENGTH_SHORT).show();
                Bundle bundle = new Bundle();
                bundle.putParcelable("animal", animalArrayList.get(position));
                Intent intentToStartDetails = new Intent(v.getContext(), ActivityDetail.class);
                intentToStartDetails.putExtras(bundle);
                v.getContext().startActivity(intentToStartDetails);
            }
        });
    }

    @NonNull
   // @Override
   // public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
     //   return null;
    //}

    /*@Override
    public void onBindViewHolder(@NonNull MyRecyclerViewAdapter.ViewHolder viewHolder, int i) {

    }*/

    public void addAnimalToList(Animal animal) {
        animalArrayList.add(animal);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return animalArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvAnimalType;
        TextView tvAnimalName;
        TextView tvAnimalSound;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAnimalType = itemView.findViewById(R.id.tvAnimalType);
            tvAnimalName = itemView.findViewById(R.id.tvAnimalName);
            tvAnimalSound = itemView.findViewById(R.id.tvAnimalSound);
        }
    }
}
