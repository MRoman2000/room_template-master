package com.company.room;


import androidx.lifecycle.LiveData;

import java.util.List;

public class RecyclerValoracionFragment extends RecyclerElementosFragment {
    LiveData<List<Elemento>> obtenerElementos() {
        return elementosViewModel.masValorados();
    }
}
