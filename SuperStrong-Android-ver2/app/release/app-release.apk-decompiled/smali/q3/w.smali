.class public final Lq3/w;
.super Lq3/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq3/x<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lq3/x;


# direct methods
.method public constructor <init>(Lq3/x;)V
    .locals 0

    iput-object p1, p0, Lq3/w;->a:Lq3/x;

    invoke-direct {p0}, Lq3/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx3/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/a;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lx3/a;->M()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lx3/a;->I()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lq3/w;->a:Lq3/x;

    invoke-virtual {v0, p1}, Lq3/x;->a(Lx3/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lx3/c;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx3/c;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lx3/c;->q()Lx3/c;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lq3/w;->a:Lq3/x;

    invoke-virtual {v0, p1, p2}, Lq3/x;->b(Lx3/c;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
