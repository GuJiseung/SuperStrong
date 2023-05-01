.class public final Lk1/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Li1/a;

.field public final synthetic b:Lk1/j;


# direct methods
.method public constructor <init>(Lk1/j;Li1/a;)V
    .locals 0

    iput-object p1, p0, Lk1/j$b;->b:Lk1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk1/j$b;->a:Li1/a;

    return-void
.end method
