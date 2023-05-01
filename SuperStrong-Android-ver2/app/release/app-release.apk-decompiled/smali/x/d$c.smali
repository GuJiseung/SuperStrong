.class public final Lx/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:[Lx/d$d;


# direct methods
.method public constructor <init>([Lx/d$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/d$c;->a:[Lx/d$d;

    return-void
.end method
