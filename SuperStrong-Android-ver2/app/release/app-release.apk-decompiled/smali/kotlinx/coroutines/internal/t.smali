.class public final Lkotlinx/coroutines/internal/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le4/f;

.field public final b:[Ljava/lang/Object;

.field public final c:[Ls4/i1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ls4/i1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public constructor <init>(Le4/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlinx/coroutines/internal/t;->a:Le4/f;

    new-array p1, p2, [Ljava/lang/Object;

    iput-object p1, p0, Lkotlinx/coroutines/internal/t;->b:[Ljava/lang/Object;

    new-array p1, p2, [Ls4/i1;

    iput-object p1, p0, Lkotlinx/coroutines/internal/t;->c:[Ls4/i1;

    return-void
.end method
