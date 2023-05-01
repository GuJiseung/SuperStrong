.class public final Le2/b;
.super Ll/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ll/b<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le2/b;->j:I

    invoke-super {p0}, Ll/h;->clear()V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Le2/b;->j:I

    if-nez v0, :cond_0

    invoke-super {p0}, Ll/h;->hashCode()I

    move-result v0

    iput v0, p0, Le2/b;->j:I

    :cond_0
    iget v0, p0, Le2/b;->j:I

    return v0
.end method

.method public final i(Ll/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le2/b;->j:I

    invoke-super {p0, p1}, Ll/h;->i(Ll/b;)V

    return-void
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Le2/b;->j:I

    invoke-super {p0, p1}, Ll/h;->j(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Le2/b;->j:I

    invoke-super {p0, p1, p2}, Ll/h;->k(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Le2/b;->j:I

    invoke-super {p0, p1, p2}, Ll/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
