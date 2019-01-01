package bits.emd.adani.SwitchYard.dm_masterDetail;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import bits.emd.adani.SwitchYard.R;
import bits.emd.adani.SwitchYard.dm_400kv.dm_400kv_br;
import bits.emd.adani.SwitchYard.dm_400kv.dm_400kv_line;
import bits.emd.adani.SwitchYard.dm_400kv.dm_400kv_misc_trafo;
import bits.emd.adani.SwitchYard.dm_400kv.dm_400kv_st;
import bits.emd.adani.SwitchYard.dm_765kv.*;
import bits.emd.adani.SwitchYard.dm_transformer_yard.*;
import bits.emd.adani.SwitchYard.dummy.DummyContent;
import bits.emd.adani.SwitchYard.dm_other.*;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);

        //--------------- 400 kv Buttons----------------//

        if (mItem.content.equals("dm400kv")) {
            rootView = inflater.inflate(R.layout.dm_400kv, container, false);

            //To start the activity from a button add it here

            //Start Bus Reactor activity
            ((Button) rootView.findViewById(R.id.dm400KvBr)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), dm_400kv_br.class);
                    view.getContext().startActivity(i);
                }
            });


            //Start Line activity
            ((Button) rootView.findViewById(R.id.dm400KvLine)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), dm_400kv_line.class);
                    view.getContext().startActivity(i);
                }
            });


            //Start Miscellaneous Transformers - 1 activity
            ((Button) rootView.findViewById(R.id.dm400KvTransfo)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View view) {
                    Intent i = new Intent(view.getContext(), dm_400kv_misc_trafo.class);
                    view.getContext().startActivity(i);
                }

            });
            //Start Station Transformer-4 activity
            ((Button) rootView.findViewById(R.id.dm400KvST)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent(v.getContext(), dm_400kv_st.class);
                    v.getContext().startActivity(i);
                }
            });
        }

        //--------------- 765 kv Buttons----------------//
        else  if (mItem.content.equals("dm765kv")) {
            rootView = inflater.inflate(R.layout.dm_765kv, container, false);

            //Start Bus Reactor activity
            ((Button) rootView.findViewById(R.id.dm765KV_BR)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_765kv_br.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start ICT activity
            ((Button) rootView.findViewById(R.id.dm765KV_ICT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_765kv_ict.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start Line activity
            ((Button) rootView.findViewById(R.id.dm765KV_LINE)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_765kv_line.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start LR activity
            ((Button) rootView.findViewById(R.id.dm765KV_LR)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_765kv_lr.class);
                    view.getContext().startActivity(i);
                }
            });


        }


        //--------------- Transformer Yard Buttons----------------//

        else  if (mItem.content.equals("dm_transformer_yard")) {
                rootView = inflater.inflate(R.layout.dm_transformer_yard, container, false);

            //Start GT 1 2 3 activity
            ((Button) rootView.findViewById(R.id.DM_TRANSFORMER_YARD_GT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_transformer_yard_gt.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start UT activity
            ((Button) rootView.findViewById(R.id.DM_TRANSFORMER_YARD_UT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_transformer_yard_ut.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start UAT activity
            ((Button) rootView.findViewById(R.id.DM_TRASNFORMER_YARD_UAT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_transformer_yard_uat.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start Prot. Panel activity
            ((Button) rootView.findViewById(R.id.DM_TRASNFORMER_YARD_PROT_PANEL)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_transformer_yard_prot_panel.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start SAT activity
            ((Button) rootView.findViewById(R.id.DM_TRASNFORMER_YARD_SAT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_transformer_yard_sat.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start ST activity
            ((Button) rootView.findViewById(R.id.DM_TRASNFORMER_YARD_ST)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_transformer_yard_st.class);
                    view.getContext().startActivity(i);
                }
            });



        }


        //-------------------- Other Buttons ---------------------//

        else  if (mItem.content.equals("dm_other")) {
            rootView = inflater.inflate(R.layout.dm_other, container, false);

            //Start 220V BC activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_220V)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_220v_bc.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start 220V AND 48V DCDB activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_220V_48V_DCB)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_220v_48v_dcdb.class);
                    view.getContext().startActivity(i);
                }
            });


            //Start UPS activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_UPS)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_ups.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start PAC AND AHU DB activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_PAC_AHU)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_pac_and_ahu_db.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start PDB EDB LDB activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_PDB)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_pdb_edb_ldb.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start 48V BC activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_48V)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_48v_bc.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start SWITCHGEAR activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_S)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_swgr.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start 765 PLCC LINE 1 activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_765_PLCC_1)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_765kv_FOTE_Line_1.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start 765 KV PLCC LINE 2 activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_765_PLCC_2)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_765kv_FOTE_Line_2.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start 400 KV PLCC LINE 1 activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_400_PLCC_1)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_400kv_PLCC_Line_1.class);
                    view.getContext().startActivity(i);
                }
            });

            //Start 400 KV PLCC LINE 2 activity
            ((Button) rootView.findViewById(R.id.DM_OTHER_400_PLCC_2)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(),dm_other_400kv_PLCC_Line_2.class);
                    view.getContext().startActivity(i);
                }
            });
        }

        return rootView;
    }

    }
