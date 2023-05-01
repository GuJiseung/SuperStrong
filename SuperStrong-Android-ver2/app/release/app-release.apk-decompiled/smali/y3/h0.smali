.class public final Ly3/h0;
.super Lg4/c;
.source "SourceFile"


# annotations
.annotation runtime Lg4/e;
    c = "com.superstrong.android.data.WalletRepo"
    f = "WalletRepo.kt"
    l = {
        0x43
    }
    m = "getHistory"
.end annotation


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ly3/j0;

.field public g:I


# direct methods
.method public constructor <init>(Ly3/j0;Le4/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/j0;",
            "Le4/d<",
            "-",
            "Ly3/h0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly3/h0;->f:Ly3/j0;

    invoke-direct {p0, p2}, Lg4/c;-><init>(Le4/d;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly3/h0;->e:Ljava/lang/Object;

    iget p1, p0, Ly3/h0;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly3/h0;->g:I

    iget-object p1, p0, Ly3/h0;->f:Ly3/j0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Ly3/j0;->c(Ly3/o;Ljava/lang/String;Ljava/lang/String;Le4/d;)Lf4/a;

    move-result-object p1

    return-object p1
.end method
