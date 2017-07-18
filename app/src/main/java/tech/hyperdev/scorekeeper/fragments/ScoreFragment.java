package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

    String team_name;
    private int totalScore=0;
    private TextView tvTeamName;
    private TextView tvScore;

    public ScoreFragment() {
        // Required empty public constructor
    }

    public static ScoreFragment newInstance(String team){

        Bundle bundle = new Bundle();
        bundle.putString("team_name", team);

        ScoreFragment fragment = new ScoreFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

/*    private void readBundle(Bundle bundle) {
        if (bundle != null) {
            team_name = bundle.getString("team_name");
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score, container, false);

//        tvScore = (TextView) view.findViewById(R.id.textView2);
        tvTeamName = (TextView) view.findViewById(R.id.tvTeamName);
        ImageButton btnPlus = (ImageButton) view.findViewById(R.id.btnPlus);
//        btnPlus.setOnClickListener((View.OnClickListener) this);
        ImageButton btnMinus = (ImageButton) view.findViewById(R.id.btnMinus);

        Bundle bundle = getArguments();
        team_name = bundle.getString("team_name");
        //        tvScore.setText(totalScore);
        tvTeamName.setText(team_name);

        return view;
    }

/*    public void setTeam_name(String team_name){
        tvTeamName.setText(team_name+"");
    }*/
/*
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnPlus:
                    totalScore = Integer.parseInt(tvScore.getText().toString()) + 1;
                    tvScore.setText(totalScore+"");
                break;
            case R.id.btnMinus:
                totalScore = Integer.parseInt(tvScore.getText().toString()) - 1;
                tvScore.setText(totalScore+"");
                break;
        }
    }*/
}
