.class public final Lg5/k$a;
.super Lg5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "Lg5/k<",
        "TResponseT;TReturnT;>;"
    }
.end annotation


# instance fields
.field public final d:Lg5/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/c<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg5/a0;Lv4/d$a;Lg5/f;Lg5/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/a0;",
            "Lv4/d$a;",
            "Lg5/f<",
            "Lv4/d0;",
            "TResponseT;>;",
            "Lg5/c<",
            "TResponseT;TReturnT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lg5/k;-><init>(Lg5/a0;Lv4/d$a;Lg5/f;)V

    iput-object p4, p0, Lg5/k$a;->d:Lg5/c;

    return-void
.end method


# virtual methods
.method public final c(Lg5/t;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lg5/k$a;->d:Lg5/c;

    invoke-interface {p2, p1}, Lg5/c;->b(Lg5/t;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
