.class public final Ly3/u;
.super Lg4/c;
.source "SourceFile"


# annotations
.annotation runtime Lg4/e;
    c = "com.superstrong.android.data.Repository"
    f = "SignupModel.kt"
    l = {
        0x36
    }
    m = "signupRequest"
.end annotation


# instance fields
.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ly3/w;

.field public g:I


# direct methods
.method public constructor <init>(Ly3/w;Le4/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/w;",
            "Le4/d<",
            "-",
            "Ly3/u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly3/u;->f:Ly3/w;

    invoke-direct {p0, p2}, Lg4/c;-><init>(Le4/d;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly3/u;->e:Ljava/lang/Object;

    iget p1, p0, Ly3/u;->g:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly3/u;->g:I

    iget-object p1, p0, Ly3/u;->f:Ly3/w;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ly3/w;->c(Ly3/a0;Le4/d;)Lf4/a;

    move-result-object p1

    return-object p1
.end method
