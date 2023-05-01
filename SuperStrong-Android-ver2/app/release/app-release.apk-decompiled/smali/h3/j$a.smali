.class public final Lh3/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lh3/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh3/j;

    invoke-direct {v0}, Lh3/j;-><init>()V

    sput-object v0, Lh3/j$a;->a:Lh3/j;

    return-void
.end method
