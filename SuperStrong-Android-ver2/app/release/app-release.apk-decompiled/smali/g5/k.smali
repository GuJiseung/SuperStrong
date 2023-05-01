.class public abstract Lg5/k;
.super Lg5/e0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/k$a;,
        Lg5/k$c;,
        Lg5/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Lg5/e0<",
        "TReturnT;>;"
    }
.end annotation


# instance fields
.field public final a:Lg5/a0;

.field public final b:Lv4/d$a;

.field public final c:Lg5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/f<",
            "Lv4/d0;",
            "TResponseT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg5/a0;Lv4/d$a;Lg5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/a0;",
            "Lv4/d$a;",
            "Lg5/f<",
            "Lv4/d0;",
            "TResponseT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg5/e0;-><init>()V

    iput-object p1, p0, Lg5/k;->a:Lg5/a0;

    iput-object p2, p0, Lg5/k;->b:Lv4/d$a;

    iput-object p3, p0, Lg5/k;->c:Lg5/f;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    new-instance v0, Lg5/t;

    iget-object v1, p0, Lg5/k;->c:Lg5/f;

    iget-object v2, p0, Lg5/k;->a:Lg5/a0;

    iget-object v3, p0, Lg5/k;->b:Lv4/d$a;

    invoke-direct {v0, v2, p1, v3, v1}, Lg5/t;-><init>(Lg5/a0;[Ljava/lang/Object;Lv4/d$a;Lg5/f;)V

    invoke-virtual {p0, v0, p1}, Lg5/k;->c(Lg5/t;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Lg5/t;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
