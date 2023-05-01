.class public final Ls3/m$c$a;
.super Ls3/m$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls3/m$c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls3/m<",
        "TK;TV;>.d<TK;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ls3/m$c;)V
    .locals 0

    iget-object p1, p1, Ls3/m$c;->b:Ls3/m;

    invoke-direct {p0, p1}, Ls3/m$d;-><init>(Ls3/m;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    invoke-virtual {p0}, Ls3/m$d;->a()Ls3/m$e;

    move-result-object v0

    iget-object v0, v0, Ls3/m$e;->g:Ljava/lang/Object;

    return-object v0
.end method
