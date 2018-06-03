package br.com.raniel.viagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import br.com.raniel.viagens.model.Pacote;

public class ResourceUtil {
    public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();
        int idDrawableDaImagem = resources.getIdentifier(drawableEmTexto, "drawable", context.getPackageName());
        return resources.getDrawable(idDrawableDaImagem);
    }
}
