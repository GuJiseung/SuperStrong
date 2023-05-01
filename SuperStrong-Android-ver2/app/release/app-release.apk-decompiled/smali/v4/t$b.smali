.class public final Lv4/t$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv4/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lv4/p;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final b:Lv4/a0;


# direct methods
.method public constructor <init>(Lv4/p;Lv4/a0;)V
    .locals 0
    .param p1    # Lv4/p;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/t$b;->a:Lv4/p;

    iput-object p2, p0, Lv4/t$b;->b:Lv4/a0;

    return-void
.end method
