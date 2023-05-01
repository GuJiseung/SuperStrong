.class public final Lz2/q$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public final b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz2/q$c;->a:I

    iput p2, p0, Lz2/q$c;->b:I

    iput p3, p0, Lz2/q$c;->c:I

    iput p4, p0, Lz2/q$c;->d:I

    return-void
.end method

.method public constructor <init>(Lz2/q$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lz2/q$c;->a:I

    iput v0, p0, Lz2/q$c;->a:I

    iget v0, p1, Lz2/q$c;->b:I

    iput v0, p0, Lz2/q$c;->b:I

    iget v0, p1, Lz2/q$c;->c:I

    iput v0, p0, Lz2/q$c;->c:I

    iget p1, p1, Lz2/q$c;->d:I

    iput p1, p0, Lz2/q$c;->d:I

    return-void
.end method
