package bits.emd.adani.SwitchYard.cbm_masterDetail;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import bits.emd.adani.SwitchYard.cbm_400kv.*;
import bits.emd.adani.SwitchYard.cbm_765kv.*;
import bits.emd.adani.SwitchYard.R;
import bits.emd.adani.SwitchYard.cbm_others_plcc_panel_level_measurement;
import bits.emd.adani.SwitchYard.dummy.DummyContent;

/**
 * A fragment representing a single cbm detail screen.
 * This fragment is either contained in a {@link cbmListActivity}
 * in two-pane mode (on tablets) or a {@link cbmDetailActivity}
 * on handsets.
 */
public class cbmDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private CbmDummyContent.CbmDummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public cbmDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = CbmDummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

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
        View rootView = inflater.inflate(R.layout.cbm_detail, container, false);

        //--------------- 400 kv Buttons----------------//

        if (mItem.content.equals("cbm400kv")) {
            rootView = inflater.inflate(R.layout.cbm_400kv_first, container, false);

            //To start the activity from a button add it here

            //Start Earth Resistance activity
            ((Button) rootView.findViewById(R.id.CBM_400KV_EARTH_RESISTANCE)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_400kv_earthing_resistance_first.class);
                    view.getContext().startActivity(i);
                }
            });


            ((Button) rootView.findViewById(R.id.CBM_400KV_CT_CVT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_400kv_ct_cvt_first.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_400KV_LEAKAGE_CURRENT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_400kv_la_lcm.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_400KV_CT_CVT_OIL)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_400kv_ct_cvt_oil_level_inspection.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_400KV_BATTERY_READING)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_400kv_battery_reading.class);
                    view.getContext().startActivity(i);
                }
            });
            ((Button) rootView.findViewById(R.id.CBM_400KV_SF6_GAS)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_400kv_sf6_gas_pressure.class);
                    view.getContext().startActivity(i);
                }
            });


        }

/////////////////////////////////////////////////////////////////////

        if (mItem.content.equals("cbm765kv")) {
            rootView = inflater.inflate(R.layout.cbm_765kv_first, container, false);

            //To start the activity from a button add it here

            //Start Earth Resistance activity
            ((Button) rootView.findViewById(R.id.CBM_765KV_EARTH_RESISTANCE)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_765kv_earthing_resistance_first.class);
                    view.getContext().startActivity(i);
                }
            });


            ((Button) rootView.findViewById(R.id.CBM_765KV_CT_CVT_OIL)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_765kv_ct_cvt_oil_level_inspection.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_765KV_SF6_GAS)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_765kv_la_lcm.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_765KV_CT_CVT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_765kv_ct_cvt_first.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_765KV_SF6_GAS)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_765kv_sf6_gas_pressure.class);
                    view.getContext().startActivity(i);
                }
            });

            ((Button) rootView.findViewById(R.id.CBM_765KV_LEAKAGE_CURRENT)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_765kv_la_lcm.class);
                    view.getContext().startActivity(i);
                }
            });


        }
/////////////////////////////////////////////////////////////


            if (mItem.content.equals("cbm_transformer_yard")) {
                rootView = inflater.inflate(R.layout.cbm_detail, container, false);

               /* //To start the activity from a button add it here

                //Start Earth Resistance activity
                ((Button) rootView.findViewById(R.id.CBM_400KV_EARTH_RESISTANCE)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), cbm_400kv_earthing_resistance_first.class);
                        view.getContext().startActivity(i);
                    }
                });


                ((Button) rootView.findViewById(R.id.CBM_400KV_CT_CVT)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), cbm_400kv_ct_cvt_first.class);
                        view.getContext().startActivity(i);
                    }
                });

                ((Button) rootView.findViewById(R.id.CBM_400KV_LEAKAGE_CURRENT)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), cbm_400kv_la_lcm.class);
                        view.getContext().startActivity(i);
                    }
                });

                ((Button) rootView.findViewById(R.id.CBM_400KV_CT_CVT_OIL)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), cbm_400kv_ct_cvt_oil_level_inspection.class);
                        view.getContext().startActivity(i);
                    }
                });

                ((Button) rootView.findViewById(R.id.CBM_400KV_BATTERY_READING)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), cbm_400kv_battery_reading.class);
                        view.getContext().startActivity(i);
                    }
                });

                ((Button) rootView.findViewById(R.id.CBM_400KV_SF6_GAS)).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(view.getContext(), cbm_400kv_sf6_gas_pressure.class);
                        view.getContext().startActivity(i);
                    }
                });

            }*/


                Toast.makeText(this.getContext(), "Transformer Yard",Toast.LENGTH_LONG);

            }
/////////////////////////////////////////////////////////


        if (mItem.content.equals("cbm_other")) {
            rootView = inflater.inflate(R.layout.cbm_others_first, container, false);

            //To start the activity from a button add it here

            //Start Earth Resistance activity
            ((Button) rootView.findViewById(R.id.CBM_OTHERS_PLCC_PANEL_first)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), cbm_others_plcc_panel_level_measurement.class);
                    view.getContext().startActivity(i);
                }
            });

        }


        return rootView;

    }
}
