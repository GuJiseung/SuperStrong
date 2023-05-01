.class public final Lcom/google/android/material/datepicker/u$a;
.super Lcom/google/android/material/datepicker/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/u;->z(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/datepicker/z<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/u;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/u;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/u$a;->a:Lcom/google/android/material/datepicker/u;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/datepicker/u$a;->a:Lcom/google/android/material/datepicker/u;

    iget-object v0, v0, Lcom/google/android/material/datepicker/a0;->V:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/datepicker/z;

    invoke-virtual {v1, p1}, Lcom/google/android/material/datepicker/z;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
