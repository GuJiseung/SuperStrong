.class public final Ls3/m$b$a;
.super Ls3/m$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls3/m$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls3/m<",
        "TK;TV;>.d<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ls3/m$b;)V
    .locals 0

    iget-object p1, p1, Ls3/m$b;->b:Ls3/m;

    invoke-direct {p0, p1}, Ls3/m$d;-><init>(Ls3/m;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls3/m$d;->a()Ls3/m$e;

    move-result-object v0

    return-object v0
.end method
