package kotlinx.coroutines.internal;

import java.util.List;
import s4.a1;
/* loaded from: classes.dex */
public interface j {
    a1 createDispatcher(List<? extends j> list);

    int getLoadPriority();

    String hintOnError();
}
